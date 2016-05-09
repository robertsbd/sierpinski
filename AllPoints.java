package sierpinski;

/**
 *
 * @author benjamin
 */
public class AllPoints {
    private Coordinates[] points = new Coordinates[Constants.ITERATIONS];
    
    AllPoints(Coordinates top, Coordinates left, Coordinates right){
            
        Coordinates target = new Coordinates();
    
        int x = top.getY();
        int y = top.getX();
                
        for(int i = 0; i < Constants.ITERATIONS; i++){
        
            int randomNumber = (int) (Math.random()*3);
            switch (randomNumber) {
                case 0: target = top;
                    break;
                case 1: target = left;
                    break;
                case 2: target = right;              
                    break;
                default:
                    break;
            }
            x = (int) (x - target.getX())/2 + target.getX();
            y = (int) (y - target.getY())/2 + target.getY();   
            points[i] = new Coordinates(x, y);
        }
    }

    /**
     * @return the startLine
     */
    public Coordinates[] getPoints() {
        return points;
    }

    
}
