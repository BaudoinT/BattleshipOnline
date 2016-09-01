            /*
             * To change this license header, choose License Headers in Project Properties.
             * To change this template file, choose Tools | Templates
             * and open the template in the editor.
             */

            package bataillenaval;

            /**
             *
             * @author collotl
             */
            public class Affichage {
                private Cellule [][] plateauJ1;
                private Cellule [][] plateauJ2;

                public Affichage(Cellule [][] plateauJ1, Cellule [][] plateauJ2){
                    this.plateauJ1=plateauJ1;
                    this.plateauJ2=plateauJ2;
                }

                public void affichagePlateau(){
                    for(int j=0;j<11;j++){
                            System.out.print(" ___");
                        }
//                    for(int i=0;i<3;i++){
                    System.out.println();    
                    System.out.print("|");
//                    }
                    for(int i=0;i<11;i++){

                        System.out.print("___|");
                    }
                    System.out.println();  
                    for(int i=0;i<10;i++){
                        System.out.print("|   ");
                            System.out.print("|\u001B[30;44m ");
                        for(int x=0;x<9;x++)
                            System.out.print("\u001B[30;44m  | ");
                    System.out.print("  |\u001B[30;47m");
                    System.out.println();
                        System.out.print("|");
                             System.out.print("___|");
                        for(int j=0;j<10;j++){

                            System.out.print("\u001B[30;44m___|");
                        }
                        System.out.println("\u001B[30;47m");        
                    }        


                }

            }
