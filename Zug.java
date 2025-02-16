import GLOOP.*;
public class Zug{

    public Zug(int posX,int posY,int posZ){
        //Gehäuse
        GLQuader meinGehaeuse;
        meinGehaeuse = new GLQuader(posX,posY,posZ,75,100,300);
        meinGehaeuse.setzeFarbe(255.00, 0, 0);
        
        //Räder
        GLZylinder meinRadVR; //VR = Vorderrad
        GLZylinder meinRadVL;
        GLZylinder meinRadHR;
        GLZylinder meinRadHL;
        
        meinRadVR = new GLZylinder(posX+37.5,posY-50,posZ+125,15,10);
        meinRadVL = new GLZylinder(posX-37.5,posY-50,posZ+125,15,10);
        meinRadHR = new GLZylinder(posX+37.5,posY-50,posZ-125,15,10);
        meinRadHL = new GLZylinder(posX-37.5,posY-50,posZ-125,15,10);

        meinRadVR.drehe(0, 90, 0);
        meinRadVL.drehe(0, 90, 0);
        meinRadHR.drehe(0, 90, 0);
        meinRadHL.drehe(0, 90, 0);
        
        //Fenster
        
        
    
    
    
    }





}