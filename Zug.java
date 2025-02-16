import GLOOP.*;
public class Zug{

    public Zug(int posX,int posY,int posZ){
    
        GLQuader meinGehaeuse;
        meinGehaeuse = new GLQuader(posX,posY,posZ,75,100,300);
        meinGehaeuse.setzeFarbe(255.00, 0, 0);
        
        GLZylinder meinRadVR; //VR = Vorderrad
        GLZylinder meinRadVL;
        GLZylinder meinRadHR;
        GLZylinder meinRadHL;
        
        meinRadVR = new GLZylinder(posX+37.5,posY-50,posZ+125,15,10);
        
        meinRadVR.drehe(0, 90, 0);
    
    
    
    }





}