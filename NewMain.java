/*
 * There are N+1 lights. Lights are placed at (0, 0), (1, 0), (2, 0) ... (N, 0). Initially all the lights are on. You want to turn off all of them one after one. You want to follow a special pattern in turning off the lights.
You will start at (0, 0).First, you walk to the right most light that is on, turn it off. Then you walk to the left most light that is on, turn it off. Then again to the right most light that is on and so on. You will stop after turning off all lights. You want to know how much distance you walked in the process. Note that distance between (a,0) and (b,0) is |a-b|.
Input
The first line of the input contains an integer T denoting the number of test cases. Each test case has a single integer N on separate line.

Output
For each test case, output the distance you walked.
 */

/**
 *
 * @author drew
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int Distance = 0;
        
        bool Lights[4];
        Lights[0] = true;
        Lights[1] = false;
        Lights[2] = true;
        Lights[3] = false;
        
        for(int j = 0; j < 4; j++)
        {
            x += 1;
            Lights[x] = false;
            x -= 1; 
            Lights[x] = false;
            y += 1;
            Distance += 1;
        }
        
    }
    
}
