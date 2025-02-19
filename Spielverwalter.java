import GLOOP.*;
public class Spielverwalter{
    public Spielverwalter(){
    
        GLSchwenkkamera meinekamera;
        meinekamera =  new GLSchwenkkamera();
       
        
        GLLicht meinlicht;
        meinlicht = new GLLicht();
       
        Zug meinZug;
        meinZug = new Zug(200,64,0);
        
        Gleis meinGleis;
        meinGleis = new Gleis(0,55,0);
        
        Mensch meinMensch;
        meinMensch = new Mensch(200,30,200);
        
        GLBoden meinBoden;
        meinBoden = new GLBoden("Boden.jpg");
        
        GLHimmel meinHimmel;
        meinHimmel = new GLHimmel("Himmel.jpg");
        
    
        
        
       
    
    }
                    
    
    
    
    
    
}