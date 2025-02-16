import GLOOP.*;
public class Spielverwalter{
    public Spielverwalter(){
    
        GLSchwenkkamera meinekamera;
        meinekamera =  new GLSchwenkkamera();
       
        
        GLLicht meinlicht;
        meinlicht = new GLLicht();
       
        Zug meinZug;
        meinZug = new Zug(0,63,0);
        
        GLBoden meinBoden;
        meinBoden = new GLBoden("Boden.jpg");
        
        GLHimmel meinHimmel;
        meinHimmel = new GLHimmel("Himmel.jpg");
        
    
    
    
    }
                    
    
    
    
    
    
}