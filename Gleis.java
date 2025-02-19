import GLOOP.*;
public class Gleis{
    public Gleis(int posX,int posY,int posZ){
    
        GLQuader meinEisenR;
        GLQuader meinEisenL;
        GLQuader MeinHolzA;
        GLQuader MeinHolzB;
        GLQuader MeinHolzC;
        GLQuader MeinHolzD;
        GLQuader MeinHolzE;
        GLQuader MeinHolzF;
    
        meinEisenR = new GLQuader(posX+35,posY-50,posZ+0,7,10,300);
        meinEisenL = new GLQuader(posX-35,posY-50,posZ+0,7,10,300);
        MeinHolzA = new GLQuader(posX+0,posY-50,posZ+125,70,6,25);
        MeinHolzB = new GLQuader(posX+0,posY-50,posZ+75,70,6,25);
        MeinHolzC = new GLQuader(posX+0,posY-50,posZ+25,70,6,25);
        MeinHolzD = new GLQuader(posX+0,posY-50,posZ-25,70,6,25);
        MeinHolzE = new GLQuader(posX+0,posY-50,posZ-75,70,6,25);
        MeinHolzF = new GLQuader(posX+0,posY-50,posZ-125,70,6,25);
        
        MeinHolzA.setzeFarbe(0.4,0.2,0.1);
        MeinHolzB.setzeFarbe(0.4,0.2,0.1);
        MeinHolzC.setzeFarbe(0.4,0.2,0.1);
        MeinHolzD.setzeFarbe(0.4,0.2,0.1);
        MeinHolzE.setzeFarbe(0.4,0.2,0.1);
        MeinHolzF.setzeFarbe(0.4,0.2,0.1);
    
    
    
    
    
    
    
    
    }









}