using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Drawing.Drawing2D;
using antlr_c.Clases;

namespace howto_maze
{
    public partial class Form1 : Form
    {
        
        public Form1()
        {
            InitializeComponent();
        }

        private int Xmin, Ymin, CellWid, CellHgt;
        private int probMoneda = 80;
        private readonly Random _random = new Random();

        
        private void btnCreate_Click(object sender, EventArgs e)
        {
            //CARGAR LABERINTO
            // Figure out the drawing geometry.
            //int wid = int.Parse(txtWidth.Text);
            //int hgt = int.Parse(txtHeight.Text);
            
            int wid = this.laberinto.getDimension()[1];
            int hgt = this.laberinto.getDimension()[0];
            string time = this.laberinto.getDirectiva().getTiempo().ToString() + this.laberinto.getDirectiva().getUnidad();


            this.txtHeight.Text = hgt.ToString();
            this.txtWidth.Text = wid.ToString();
            this.label4.Text = time;
            this.label5.Text = this.laberinto.getDirectiva().getVida().ToString();



            CellWid = picMaze.ClientSize.Width / (wid + 2);
            CellHgt = picMaze.ClientSize.Height / (hgt + 2);
            if (CellWid > CellHgt) CellWid = CellHgt;
            else CellHgt = CellWid;
            Xmin = (picMaze.ClientSize.Width - wid * CellWid) / 2;
            Ymin = (picMaze.ClientSize.Height - hgt * CellHgt) / 2;

            // Build the maze nodes.
            MazeNode[,] nodes = MakeNodes(wid, hgt);

            // Build the spanning tree.
            FindSpanningTree(nodes[0, 0]);

            // Display the maze.
            DisplayMaze(nodes);
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void label5_Click(object sender, EventArgs e)
        {

        }

        // Make the network of MazeNodes.
        private MazeNode[,] MakeNodes(int wid, int hgt)
        {
            // Make the nodes.
            MazeNode[,] nodes = new MazeNode[hgt, wid];
            for (int r = 0; r < hgt; r++)
            {
                int y = Ymin + CellHgt * r;
                for (int c = 0; c < wid; c++)
                {
                    int x = Xmin + CellWid * c;
                    nodes[r, c] = new MazeNode(
                        x, y, CellWid, CellHgt);
                }
            }

            // Initialize the nodes' neighbors.
            for (int r = 0; r < hgt; r++)
            {
                for (int c = 0; c < wid; c++)
                {
                    if (r > 0)
                        nodes[r, c].Neighbors[MazeNode.North] = nodes[r - 1, c];
                    if (r < hgt - 1)
                        nodes[r, c].Neighbors[MazeNode.South] = nodes[r + 1, c];
                    if (c > 0)
                        nodes[r, c].Neighbors[MazeNode.West] = nodes[r, c - 1];
                    if (c < wid - 1)
                        nodes[r, c].Neighbors[MazeNode.East] = nodes[r, c + 1];
                }
            }

            // Return the nodes.
            return nodes;
        }

        // Build a spanning tree with the indicated root node.
        private void FindSpanningTree(MazeNode root)
        {
            Random rand = new Random();

            // Set the root node's predecessor so we know it's in the tree.
            root.Predecessor = root;

            // Make a list of candidate links.
            List<MazeLink> links = new List<MazeLink>();

            // Add the root's links to the links list.
            foreach (MazeNode neighbor in root.Neighbors)
            {
                if (neighbor != null)
                    links.Add(new MazeLink(root, neighbor));
            }

            // Add the other nodes to the tree.
            while (links.Count > 0)
            {
                // Pick a random link.
                int link_num = rand.Next(0, links.Count);
                MazeLink link = links[link_num];
                links.RemoveAt(link_num);

                // Add this link to the tree.
                MazeNode to_node = link.ToNode;
                link.ToNode.Predecessor = link.FromNode;

                // Remove any links from the list that point
                // to nodes that are already in the tree.
                // (That will be the newly added node.)
                for (int i = links.Count - 1; i >= 0; i--)
                {
                    if (links[i].ToNode.Predecessor != null)
                        links.RemoveAt(i);
                }

                // Add to_node's links to the links list.
                foreach (MazeNode neighbor in to_node.Neighbors)
                {
                    if ((neighbor != null) && (neighbor.Predecessor == null))
                        links.Add(new MazeLink(to_node, neighbor));
                }
            }
        }

        // Display the maze in the picMaze PictureBox.
        private void DisplayMaze(MazeNode[,] nodes)
        {
            int hgt = nodes.GetUpperBound(0) + 1;
            int wid = nodes.GetUpperBound(1) + 1;
            this.txtHeight.Text = hgt.ToString();
            this.txtWidth.Text = wid.ToString();
            
            //int coordXplayer = _random.Next(0, wid);
            //int coordYplayer = _random.Next(0, hgt);
            int coordXplayer = this.laberinto.getInicio().getCoordX()-1;
            int coordYplayer = this.laberinto.getInicio().getCoordY()-1;

            //int coordXexit = _random.Next(0, wid);
            //int coordYexit = _random.Next(0, hgt);
            int coordXexit = this.laberinto.getMeta().getCoordX()-1;
            int coordYexit = this.laberinto.getMeta().getCoordY()-1;

            /*while (coordYplayer == coordYexit && coordXplayer == coordXexit) {
                coordXexit = _random.Next(0, wid);
                coordYexit = _random.Next(0, hgt);
            }*/
            Bitmap bm = new Bitmap(
                picMaze.ClientSize.Width,
                picMaze.ClientSize.Height);
            using (Graphics gr = Graphics.FromImage(bm))
            {
                gr.SmoothingMode = SmoothingMode.AntiAlias;
                for (int r = 0; r < hgt; r++)
                {
                    for (int c = 0; c < wid; c++)
                    {
                        
                        if (r == coordYplayer && c == coordXplayer) {
                            nodes[r, c].DrawCenter(gr, Brushes.Blue);
                        }
                        if (r == coordYexit && c == coordXexit)
                        {
                            nodes[r, c].DrawCenter(gr, Brushes.Green);
                        }

                        nodes[r, c].DrawWalls(gr, Pens.Black);
                        //nodes[r, c].DrawNeighborLinks(gr, Pens.Black);
                        //nodes[r, c].DrawBoundingBox(gr, Pens.Blue);
                        //nodes[r, c].DrawPredecessorLink(gr, Pens.LightGray);
                    }
                }

                List<Elemento> localizaciones = this.laberinto.getLocalizaciones();
               
                List<Coordenada> coordenadas;
                if (localizaciones != null) {
                    for (int i = 0; i < localizaciones.Count; i++)
                    {
                            
                        coordenadas = localizaciones.ElementAt(i).getCoordenadas() ;
                        for (int j = 0; j < coordenadas.Count; j++) {
                            if (localizaciones.ElementAt(i).getElemento() == "moneda")
                            {
                                nodes[coordenadas.ElementAt(j).getCoordY()-1, coordenadas.ElementAt(j).getCoordX()-1].DrawCenter(gr, Brushes.Yellow);
                            }
                            else if (localizaciones.ElementAt(i).getElemento() == "enemigo") {
                                nodes[coordenadas.ElementAt(j).getCoordY()-1, coordenadas.ElementAt(j).getCoordX()-1].DrawCenter(gr, Brushes.Red);
                            }
                        } 
                    }
                }
                
                /*if (_random.Next(0, 100) >= probMoneda)
                {
                    nodes[r, c].DrawCenter(gr, Brushes.Yellow);
                }*/
            }

            picMaze.Image = bm;
        }
    }
}
