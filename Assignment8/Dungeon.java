/*
a) Rect x y Width Height Rect x y Width Height
b) 0 0 10 20 100 5 125 2 20 7 10 0
c) 0 0 1 0 2 0 1 0 0 5 1 2 5 2 2 0 7 1 0 0
d) Rect x        y	 	  Width  	Height
   Rect x  .   y	     .  Width  .     Height  .
e) in.useDelimiter ("[^0-9]");
 */

import java.util.*;

public class Dungeon {
    private Monster[][] monsters;
    public int gridWidth;
    public int gridHeight;

    public Dungeon(int width, int height) {
        monsters = new Monster[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                monsters[i][j] = new Monster();
            }
        }
        this.gridWidth = width;
        this.gridHeight = height;
    }

    public void updateMonster(int x, int y, Monster m) {
        if (monsters[y][x].getName() == "" && monsters[y][x].getLevel() == -1) {
            monsters[y][x].setName(m.getName());
            monsters[y][x].setLevel(m.getLevel());
        }
    }

    private void swap(int x1, int y1, int x2, int y2) {
        Monster t;
        t = monsters[y1][x1];
        monsters[y1][x1] = monsters[y2][x2];
        monsters[y2][x2] = t;
    }

    public void shuffle() {
        Random r = new Random();
        for (int i = 0; i < gridHeight * gridWidth; i++) {
            int y1 = r.nextInt(gridHeight - 1);
            int y2 = r.nextInt(gridHeight - 1);
            int x1 = r.nextInt(gridWidth - 1);
            int x2 = r.nextInt(gridWidth - 1);
            this.swap(x1, y1, x2, y2);
        }
    }

    public void shift(char command) {
        Monster temp;
        switch (command) {
            case 'w':
                for (int i = 0; i < gridWidth; i++) {
                    temp = monsters[0][i];
                    for (int j = 1; j < gridHeight; j++) {
                        monsters[j - 1][i] = monsters[j][i];
                    }
                    monsters[gridHeight - 1][i] = temp;
                }
                break;
            case 'a':
                for (int i = 0; i < gridHeight; i++) {
                    temp = monsters[i][gridWidth - 1];
                    for (int j = gridWidth - 1; j > 0; j--) {
                        monsters[i][j] = monsters[i][j - 1];
                    }
                    monsters[i][0] = temp;
                }
                break;
            case 's':
                for (int i = 0; i < gridWidth; i++) {
                    temp = monsters[gridHeight - 1][i];
                    for (int j = 1; j < gridHeight - 1; j++) {
                        monsters[j][i] = monsters[j + 1][i];
                    }
                    monsters[0][i] = temp;
                }
                break;
            case 'd':
                for (int i = 0; i < gridHeight; i++) {
                    temp = monsters[i][0];
                    for (int j = 1; j < gridWidth; j++) {
                        monsters[i][j - 1] = monsters[i][j];
                    }
                    monsters[i][gridWidth - 1] = temp;
                }
                break;
        }
    }

    public String printInfo(){
        String fin = "";
        for(int i=0;i<gridHeight;i++){
            for(int j=0;j<gridWidth;j++){
                fin += monsters[i][j].getInfo();
                fin += "  ";
            }
            fin += "\n";
        }
        return fin;
    }
}


