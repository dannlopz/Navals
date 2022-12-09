package com.mycompany.mavenproject10;
import java.util.Scanner;


public class Mavenproject10 {
    static int[][]tablero;
      static String player1,player2;
    static int [][] tablero2;
    static int tirosjugador1=10,tirosjugador2=10,aquiles,max;
    static int filas,columnas;
    
   
    
    
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada=new Scanner (System.in);
        System.out.println("ingreseElNumeroDeFilas");
        filas=entrada.nextInt();
        System.out.println("ingreseCuantasColumas");
        columnas=entrada.nextInt();
        tablero=new int[filas][columnas];
        for(int i= 0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                tablero[i][j]=1;
                
            
        }
        }   
              
         tablero2=new int [filas][columnas];
             for(int i= 0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                tablero2[i][j]=1;
                
            }
        }
             
            
        for(int i= 0; i<filas; i++){
               for(int j=0; j<columnas; j++){
                System.out.print(tablero[i][j]+" ");
                
            } 
                  System.out.println("");
              }
             
        
           System.out.println("jugador1");
            player1=entrada.next();
           System.out.println("quieres ingresar tus barcos");
           String opc=entrada.next();
           if(opc.equalsIgnoreCase("s")){
               jugador1(player1);
           }else{
               System.out.println("salio el jugador");
           }
             System.out.println("jugador2");
            player2=entrada.next();
           System.out.println("quieres ingresar tus barcos");
            opc=entrada.next();
           if(opc.equalsIgnoreCase("s")){
               jugador2(player2);
           }else{
               System.out.println("salio el jugador");
           }
           bomba();
    
         
        }
    public static void bomba(){
        Scanner leer=new Scanner (System.in);
        System.out.println("es tu turno " + player1);
        do{
             System.out.println("Tienes "+ tirosjugador1);
            System.out.println("indica cordenadas x");
             aquiles=leer.nextInt();
            System.out.println("ingresa cordenadas en y");
             max=leer.nextInt();
            if(aquiles>=1 && aquiles<=filas && max>=1 && max<=columnas){
                for(int i=0;i<filas;i++){
                    for(int j=0;j<columnas;j++){
                        
                    }
                }
                if(tablero2[aquiles][max]==9){
                    System.out.println("le diste al barco");
                    for(int i=0;i<filas;i++){
                        for(int j=0;j<columnas;j++){
                            tablero2[aquiles][max]=5; 
                        }
                    }
                }else if(tablero2[aquiles][max]==1){
                    System.out.println("no le diste al barco ");
                    for(int i=0;i<filas;i++){
                        for(int j=0;j<columnas;j++){
                            tablero2[aquiles][max]=5; 
                        }
                    }
                }
            }
            tirosjugador1--;
        
        }while(tirosjugador1>0);
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print(tablero2[i][j]+" ");
            }
            System.out.println("");
            
        }
        System.out.println("turno de jugador 2"+player2);
        do{
             System.out.println("Tienes "+ tirosjugador2);
            System.out.println("indica cordenadas x");
             aquiles=leer.nextInt();
            System.out.println("ingresa cordenadas en y");
             max=leer.nextInt();
            if(aquiles>=1 && aquiles<=filas && max>=1 && max<=columnas){
                for(int i=0;i<filas;i++){
                    for(int j=0;j<columnas;j++){
                        
                    }
                }
                if(tablero[aquiles][max]==9){
                    System.out.println("le diste al barco");
                    for(int i=0;i<filas;i++){
                        for(int j=0;j<columnas;j++){
                            tablero[aquiles][max]=5; 
                        }
                    }
                }else if(tablero[aquiles][max]==1){
                    System.out.println("no le diste al barco ");
                    for(int i=0;i<filas;i++){
                        for(int j=0;j<columnas;j++){
                            tablero[aquiles][max]=5; 
                        }
                    }
                }
            }
            tirosjugador2--;
        
        }while(tirosjugador2>0);
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print(tablero[i][j]+" ");
            }
            System.out.println("");
            
        }
        for(int i =0;i<tablero2.length;i++){
            for(int j=0;j<tablero2.length-1;i++){
                if(tablero2[i][j]==9){
                    System.out.println("perdiste"+ player2);
                    for(int x=0;x<filas;x++){
                        for(int y=0;y<columnas;y++){
                            System.out.print(tablero[x][y]+" ");
                         }
                               System.out.println("");
            
                            }
                }else{
                    System.out.println("---------Ganaste--------"+player2);
                    for(int x=0;x<filas;x++){
                        for(int y=0;y<columnas;y++){
                            System.out.print(tablero[x][y]+" ");
                         }
                               System.out.println("");
            
                            }
                }
                return;
            }
            
        }
        for(int i =0;i<tablero.length;i++){
            for(int j=0;j<tablero.length-1;i++){
                if(tablero[i][j]==9){
                    System.out.println("perdiste"+ player1);
                    for(int x=0;x<filas;x++){
                        for(int y=0;y<columnas;y++){
                            System.out.print(tablero[x][y]+" ");
                         }
                               System.out.println("");
            
                            }
                }else{
                    System.out.println("---------Ganaste--------"+ player1);
                    for(int x=0;x<filas;x++){
                        for(int y=0;y<columnas;y++){
                            System.out.print(tablero[x][y]+" ");
                         }
                               System.out.println("");
            
                            }
                }
                return;
            }
            
        }
    }
    
    public static void jugador1(String jugador1){
         Scanner entrada=new Scanner (System.in);
        
        
            System.out.println("ingrese la pocision de su primer barco");
            
               
                       String psc=entrada.next();
                switch(psc){
                    
            case"h": 
                System.out.println("cualesSonTusCordenadas");
                int crh=entrada.nextInt();
                System.out.println("cualesSonTuscordenadas y ");
                int crv=entrada.nextInt();
                if(crh>=1&&crh<=filas&&crv>=0&&crv<=7){
                    for(int i=0; i<4; i++){
                        tablero[crh - 1][crv+i]=9;
                        
                    }
                    for(int i= 0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(tablero[i][j]+" ");
                
            } 
                  System.out.println("");
              }
                    
                }
                break;
            case "v":
                  System.out.println("cualesSonTusCordenadas");
                int afd=entrada.nextInt();
                System.out.println("cualesSonTuscordenadas y ");
                int mro=entrada.nextInt();
                if(afd>=1&&afd<=7&&mro>=1&&mro<=columnas){
                    for(int i=0; i<4; i++){
                        tablero[afd+i][mro-1]=9;
                        
                    }
                    for(int i= 0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(tablero[i][j]+" ");
                
            } 
                  System.out.println("");
              }
                }
                break;
            default:
                System.out.println("ingresa una pocision valida");
                }
                
                
             
                
                  
         System.out.println("ingrese la pocision de su segundo barco");
                psc=entrada.next();
                switch(psc){
                    
            case"h": 
                System.out.println("cualesSonTusCordenadas");
                int crh=entrada.nextInt();
                System.out.println("cualesSonTuscordenadas y ");
                int crv=entrada.nextInt();
                if(crh>=1&&crh<=filas&&crv>=1&&crv<=7){
                    for(int i=0; i<3; i++){
                        tablero[crh-1][crv+i]=9;
                        
                    }
                    for(int i= 0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(tablero[i][j]+" ");
                
            } 
                  System.out.println("");
              }
                  
                }
                break;
                
            case "v":
                  System.out.println("cualesSonTusCordenadas");
                int afd=entrada.nextInt();
                System.out.println("cualesSonTuscordenadas y ");
                int mro=entrada.nextInt();
                if(afd>=1&&afd<=7&&mro>=1&&mro<=columnas){
                    for(int i=0; i<3; i++){
                        tablero[afd+i][mro-1]=9;
                        
                    }
                    for(int i= 0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(tablero[i][j]+" ");
                
            } 
                  System.out.println("");
              }
                }
                break;
                }
                
     System.out.println("ingrese la pocision de su tercer  barco");
                psc=entrada.next();
                switch(psc){
                    
            case"h": 
                System.out.println("cualesSonTusCordenadas");
                int crh=entrada.nextInt();
                System.out.println("cualesSonTuscordenadas y ");
                int crv=entrada.nextInt();
                if(crh>=1&&crh<=filas&&crv>=1&&crv<=7){
                    for(int i=0; i<2; i++){
                        tablero[crh-1][crv+i]=9;
                        
                    }
                    for(int i= 0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(tablero[i][j]+" ");
                
            } 
                  System.out.println("");
              }
                  
                }
                break;
                
            case "v":
                  System.out.println("cualesSonTusCordenadas");
                int afd=entrada.nextInt();
                System.out.println("cualesSonTuscordenadas y ");
                int mro=entrada.nextInt();
                if(afd>=1&&afd<=7&&mro>=1&&mro<=columnas){
                    for(int i=0; i<2; i++){
                        tablero[afd+i][mro-1]=9;
                        
                    }
                    for(int i= 0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(tablero[i][j]+" ");
                
            } 
                  System.out.println("");
              }
                }
                break;
                }
                    
         System.out.println("ingrese la pocision de su cuarto  barco");
                psc=entrada.next();
                switch(psc){
                    
            case"h": 
                System.out.println("cualesSonTusCordenadas");
                int crh=entrada.nextInt();
                System.out.println("cualesSonTuscordenadas y ");
                int crv=entrada.nextInt();
                if(crh>=1&&crh<=filas&&crv>=1&&crv<=7){
                    for(int i=0; i<1; i++){
                        tablero[crh-1][crv+i]=9;
                        
                    }
                    for(int i= 0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(tablero[i][j]+" ");
                
            } 
                  System.out.println("");
              }
                  
                }
                break;
                
            case "v":
                  System.out.println("cualesSonTusCordenadas");
                int afd=entrada.nextInt();
                System.out.println("cualesSonTuscordenadas y ");
                int mro=entrada.nextInt();
                if(afd>=1&&afd<=7&&mro>=1&&mro<=columnas){
                    for(int i=0; i<1; i++){
                        tablero[afd+i][mro-1]=9;
                        
                    }
                    for(int i= 0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(tablero[i][j]+" ");
                
            } 
                  System.out.println("");
              }
                }
                break;
                }

    }
      
    
    
     
   public static void jugador2(String name){
        Scanner entrada=new Scanner (System.in);
        
        
            System.out.println("ingrese la pocision de su primer barco");
            
               
                       String psc=entrada.next();
        int filas1 = filas;
                switch(psc){
                    
            case"h": 
                System.out.println("cualesSonTusCordenadas");
                int crh=entrada.nextInt();
                System.out.println("cualesSonTuscordenadas y ");
                int crv=entrada.nextInt();
                if(crh>=1&&crh<=filas&&crv>=1&&crv<=7){
                    for(int i=0; i<4; i++){
                        tablero2[crh-1][crv+i]=9;
                        
                    }
                    for(int i= 0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(tablero2[i][j]+" ");
                
            } 
                  System.out.println("");
              }
                    
                }
                break;
            case "v":
                  System.out.println("cualesSonTusCordenadas");
                int afd=entrada.nextInt();
                System.out.println("cualesSonTuscordenadas y ");
                int mro=entrada.nextInt();
                if(afd>=1&&afd<=7&&mro>=1&&mro<=columnas){
                    for(int i=0; i<4; i++){
                        tablero2[afd+i][mro-1]=9;
                        
                    }
                    for(int i= 0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(tablero2[i][j]+" ");
                
            } 
                  System.out.println("");
              }
                }
                break;
            default:
                System.out.println("ingresa una pocision valida");
                }
                
                
                
         System.out.println("ingrese la pocision de su segundo barco");
                psc=entrada.next();
                switch(psc){
                    
            case"h": 
                System.out.println("cualesSonTusCordenadas");
                int crh=entrada.nextInt();
                System.out.println("cualesSonTuscordenadas y ");
                int crv=entrada.nextInt();
                if(crh>=1&&crh<=filas&&crv>=1&&crv<=7){
                    for(int i=0; i<3; i++){
                        tablero2[crh-1][crv+i]=9;
                        
                    }
                    for(int i= 0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(tablero2[i][j]+" ");
                
            } 
                  System.out.println("");
              }
                  
                }
                break;
                
            case "v":
                  System.out.println("cualesSonTusCordenadas");
                int afd=entrada.nextInt();
                System.out.println("cualesSonTuscordenadas y ");
                int mro=entrada.nextInt();
                if(afd>=1&&afd<=7&&mro>=1&&mro<=columnas){
                    for(int i=0; i<3; i++){
                        tablero2[afd+i][mro-1]=9;
                        
                    }
                    for(int i= 0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(tablero2[i][j]+" ");
                
            } 
                  System.out.println("");
              }
                }
                break;
                }
                
     System.out.println("ingrese la pocision de su tercer  barco");
                psc=entrada.next();
                switch(psc){
                    
            case"h": 
                System.out.println("cualesSonTusCordenadas");
                int crh=entrada.nextInt();
                System.out.println("cualesSonTuscordenadas y ");
                int crv=entrada.nextInt();
                if(crh>=1&&crh<=filas&&crv>=1&&crv<=7){
                    for(int i=0; i<2; i++){
                        tablero2[crh-1][crv+i]=9;
                        
                    }
                    for(int i= 0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(tablero2[i][j]+" ");
                
            } 
                  System.out.println("");
              }
                  
                }
                break;
                
            case "v":
                  System.out.println("cualesSonTusCordenadas");
                int afd=entrada.nextInt();
                System.out.println("cualesSonTuscordenadas y ");
                int mro=entrada.nextInt();
                if(afd>=1&&afd<=7&&mro>=1&&mro<=columnas){
                    for(int i=0; i<2; i++){
                        tablero2 [afd+i][mro-1]=9;
                        
                    }
                    for(int i= 0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(tablero2[i][j]+" ");
                
            } 
                  System.out.println("");
              }
                }
                break;
                }
                    
         System.out.println("ingrese la pocision de su cuarto  barco");
                psc=entrada.next();
                switch(psc){
                    
            case"h": 
                System.out.println("cualesSonTusCordenadas");
                int crh=entrada.nextInt();
                System.out.println("cualesSonTuscordenadas y ");
                int crv=entrada.nextInt();
                if(crh>=1&&crh<=filas&&crv>=1&&crv<=7){
                    for(int i=0; i<1; i++){
                        tablero2[crh-1][crv+i]=9;
                        
                    }
                    for(int i= 0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(tablero2[i][j]+" ");
                
            } 
                  System.out.println("");
              }
                  
                }
                break;
                
            case "v":
                  System.out.println("cualesSonTusCordenadas");
                int afd=entrada.nextInt();
                System.out.println("cualesSonTuscordenadas y ");
                int mro=entrada.nextInt();
                if(afd>=1&&afd<=7&&mro>=1&&mro<=columnas){
                    for(int i=0; i<1; i++){
                        tablero2[afd+i][mro-1]=9;
                        
                    }
                    for(int i= 0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(tablero2[i][j]+" ");
                
            } 
                  System.out.println("");
              }
                }
               break;
                }
               
       
                
   }
}



