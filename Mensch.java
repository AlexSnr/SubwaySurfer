import GLOOP.*;
public class Mensch{
    GLQuader meinTorso;
    GLKugel meinKopf;
    GLZylinder meinArmR;
    GLZylinder meinArmL;
    GLZylinder meinBeinR;
    GLZylinder meinBeinL;
    public Mensch(int posX, int posY, int posZ){
    
        
        
        meinTorso = new GLQuader(posX+0,posY+20,posZ+0,20,30,10);
        meinKopf = new GLKugel(posX+0,posY+45,posZ+0,10);
        meinArmR = new GLZylinder(posX+16,posY+20,posZ+0,5,30);
        meinArmL = new GLZylinder(posX-16,posY+20,posZ+0,5,30);
        meinBeinR = new GLZylinder(posX+8,posY-10,posZ+0,5,35);
        meinBeinL = new GLZylinder(posX-8,posY-10,posZ+0,5,35);
        
        meinArmR.drehe(90,0,0);
        meinArmL.drehe(90,0,0);
        meinBeinR.drehe(90,0,0);
        meinBeinL.drehe(90,0,0);
        
        meinTorso.setzeFarbe(0.1,0.9,0.1);
        meinKopf.setzeFarbe(1,0.5,0.25);
        meinArmR.setzeFarbe(1,0.5,0.25);
        meinArmL.setzeFarbe(1,0.5,0.25);
        meinBeinR.setzeFarbe(0.1,0.1,0.9);
        meinBeinL.setzeFarbe(0.1,0.1,0.9);
        
        
    
    
    }

    public void bewege(){
    
        meinKopf.verschiebe(0, 0, -1);
        meinTorso.verschiebe(0, 0, -1);
        meinArmR.verschiebe(0, 0, -1);
        meinArmL.verschiebe(0, 0, -1);
        meinBeinR.verschiebe(0, 0, -1);
        meinBeinL.verschiebe(0, 0, -1);

    }
    
    public void springelinks(){
        for(int i = 0;i<220;i++){
            meinKopf.verschiebe(-0.5, 0, 0);
            meinTorso.verschiebe(-0.5, 0, 0);
            meinArmR.verschiebe(-0.5, 0, 0);
            meinArmL.verschiebe(-0.5, 0, 0);
            meinBeinR.verschiebe(-0.5, 0, 0);
            meinBeinL.verschiebe(-0.5, 0, 0);
        }
    }
    
    public void springerechts(){
        for(int i = 0;i<220;i++){
            meinKopf.verschiebe(0.5, 0, 0);
            meinTorso.verschiebe(0.5, 0, 0);
            meinArmR.verschiebe(0.5, 0, 0);
            meinArmL.verschiebe(0.5, 0, 0);
            meinBeinR.verschiebe(0.5, 0, 0);
            meinBeinL.verschiebe(0.5, 0, 0);
        }

    }


}