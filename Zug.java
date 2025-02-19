import GLOOP.*;
public class Zug{

    public Zug(int posX,int posY,int posZ){
        //Gehäuse
        GLQuader meinGehaeuse;
        GLQuader meinGehaeuseFront;
        GLQuader meinGehaeuseDach;
        GLQuader meinGehaeuseSchutz;
        GLQuader meinGehaeuseKueler;
        
        meinGehaeuse = new GLQuader(posX,posY,posZ,75,100,300);
        meinGehaeuseFront = new GLQuader(posX+0,posY+0,posZ+150,70,98,20);
        meinGehaeuseDach = new GLQuader(posX+0,posY+50,posZ+0,73,10,297);
        meinGehaeuseSchutz = new GLQuader(posX+0,posY-50,posZ+160,73,15,5);
        meinGehaeuseKueler = new GLQuader(posX+0,posY-25,posZ+160,30,7,5);
        
        meinGehaeuse.setzeFarbe(0.8,0.05,0);
        meinGehaeuseFront.setzeFarbe(0.8,0.05,0);
        meinGehaeuseDach.setzeFarbe(0.3,0.3,0.3);
        meinGehaeuseSchutz.setzeFarbe(0.3,0.3,0.3);
        
        meinGehaeuseSchutz.drehe(170, 0, 0);
        
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
        
        //Scheinwerfer
        GLZylinder meineScheinwerferR;
        GLZylinder meineScheinwerferL;
        
        meineScheinwerferR = new GLZylinder(posX+27,posY-20,posZ+160,5,6);
        meineScheinwerferL = new GLZylinder(posX-27,posY-20,posZ+160,5,6);
    
        meineScheinwerferR.setzeFarbe(0.7,0.7,0);
        meineScheinwerferL.setzeFarbe(0.7,0.7,0);
    
    
    }





}