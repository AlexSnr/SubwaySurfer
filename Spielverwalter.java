import GLOOP.*;
public class Spielverwalter{
    public Spielverwalter(){
    
        GLSchwenkkamera meinekamera;
        meinekamera =  new GLSchwenkkamera();
       
        
        GLLicht meinlicht;
        meinlicht = new GLLicht();
       
        Zug meinZug;
        meinZug = new Zug(110,70,0);
        
        
        
        Mensch meinMensch;
        meinMensch = new Mensch(0,30,200);
        
        GLBoden meinBoden;
        meinBoden = new GLBoden("Boden.jpg");
        
        GLHimmel meinHimmel;
        meinHimmel = new GLHimmel("Himmel.jpg");
        
        GLTastatur meineTastatur;
        meineTastatur = new GLTastatur();
        
        
        gleisenaufbau();

        boolean tastelosgelassen = true;
        while(meineTastatur.istGedrueckt('x')==false){
            
            if(meineTastatur.istGedrueckt('w')){
        
                meinMensch.bewege();
                meinekamera.verschiebe(0,0,-1);

            }
            if(tastelosgelassen){
                if(meineTastatur.istGedrueckt('a')){
            
                    meinMensch.springelinks();
                    tastelosgelassen = false;
                }
            }
            if(!meineTastatur.istGedrueckt('a')){
                tastelosgelassen = true;
            }
            Sys.warte();
        }

    }
                    
    public void gleisenaufbau(){
        for(int i = 0;i<100;i++){
            Gleis meinGleis;
            meinGleis = new Gleis(0,55,0+i*(-300));
            Gleis meinGleisL;
            meinGleis = new Gleis(-110,55,0+i*(-300));
            Gleis meinGleisR;
            meinGleis = new Gleis(110,55,0+i*(-300));
   
        }

    }
   
}