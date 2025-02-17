import GLOOP.*;
public class Zug{

    public Zug(int posX,int posY,int posZ){
        //Gehäuse
        GLQuader meinGehaeuse;
        GLQuader meinGehaeuseFront;
        GLQuader meinGehaeuseDach;
        meinGehaeuse = new GLQuader(posX,posY,posZ,75,100,300);
        meinGehaeuseFront = new GLQuader(posX+0,posY+0,posZ+150,70,98,20);
        meinGehaeuseDach = new GLQuader(posX+0,posY+50,posZ+0,73,10,297);
        meinGehaeuse.setzeFarbe(152,20,0);
        meinGehaeuseFront.setzeFarbe(152,20,0);
        
        //Räder
        GLZylinder meinRadVR; //VR = Vorderrad
        GLZylinder meinRadVL;
        GLZylinder meinRadHR;
        GLZylinder meinRadHL;
        GLZylinder meinRadMVR; //MVR = Mittleresvorderrad
        GLZylinder meinRadMVL;
        GLZylinder meinRadMHR;
        GLZylinder meinRadMHL;
        
        meinRadMVR = new GLZylinder(posX+35,posY-50,posZ+75,15,4);
        meinRadMVL = new GLZylinder(posX-35,posY-50,posZ+75,15,4);
        meinRadMHR = new GLZylinder(posX+35,posY-50,posZ-75,15,4);
        meinRadMHL = new GLZylinder(posX-35,posY-50,posZ-75,15,4);
        meinRadVR = new GLZylinder(posX+35,posY-50,posZ+125,15,4);
        meinRadVL = new GLZylinder(posX-35,posY-50,posZ+125,15,4);
        meinRadHR = new GLZylinder(posX+35,posY-50,posZ-125,15,4);
        meinRadHL = new GLZylinder(posX-35,posY-50,posZ-125,15,4);
        
        meinRadMVR.drehe(0, 90, 0);
        meinRadMVL.drehe(0, 90, 0);
        meinRadMHR.drehe(0, 90, 0);
        meinRadMHL.drehe(0, 90, 0);
        meinRadVR.drehe(0, 90, 0);
        meinRadVL.drehe(0, 90, 0);
        meinRadHR.drehe(0, 90, 0);
        meinRadHL.drehe(0, 90, 0);
        
        //Fenster
        GLQuader meineFensterVR;
        GLQuader meineFensterVL;
        GLQuader meineFensterHR;
        GLQuader meineFensterHL;
        GLQuader meineFensterFront;
        
        meineFensterVR = new GLQuader(posX+37.5,posY+10,posZ+75,5,25,75);
        meineFensterVL = new GLQuader(posX-37.5,posY+10,posZ+75,5,25,75);
        meineFensterHR = new GLQuader(posX+37.5,posY+10,posZ-75,5,25,75);
        meineFensterHL = new GLQuader(posX-37.5,posY+10,posZ-75,5,25,75);
        meineFensterFront = new GLQuader(posX+0,posY+15,posZ+160,55,40,5);
        
        meineFensterVR.setzeFarbe(0,193,255);
        meineFensterVL.setzeFarbe(0,193,255);
        meineFensterHR.setzeFarbe(0,193,255);
        meineFensterHL.setzeFarbe(0,193,255);
        meineFensterFront.setzeFarbe(0,193,255);
    
    
    
    
    
    
    
    }





}