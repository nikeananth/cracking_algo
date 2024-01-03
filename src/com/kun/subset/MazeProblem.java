package com.kun.subset;

import java.util.ArrayList;

public class MazeProblem {

    public static void main(String[] args) {
        System.out.println(count(3,3));
        System.out.println(countPath("",3,3));
        System.out.println(countPathList("",3,3));
        System.out.println(countPathListDiag("",3,3));


        boolean maze[][]={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
       // countPathRiver("",maze,0,0);
        boolean maze1[][]={
                {true,true,true,true},
                {true,false,true,true},
                {true,true,true,true},
                {true,true,true,true}
        };
        countPathRiverDiag("",maze,0,0);
        boolean maze2[][]={
                {true,true,true,true},
                {true,true,true,true},
                {true,true,true,true},
                {true,true,true,true}
        };
        System.out.println(countPathRiverDiagAll("",maze2,0,0));

        int maze3[][]={
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}
        };
        System.out.println(countPathRiverDiagAllStep("","",maze3,0,0,0));
    }


   static int count(int c,int r){
        if(r==1||c==1){
            return 1;
        }
        int left=count(c,r-1);
       int right=count(c-1,r);
       return left+right;
   }


    static int countPath(String p,int c,int r){
        if(r==1&&c==1){
            System.out.println(p);
            return 1;
        }
        int left=0;
        int right=0;
        if(r>1){
             left=countPath(p+"D",c,r-1);
          }
       if(c>1){
            right=countPath(p+"R",c-1,r);
         }
        return left+right;
    }


    static ArrayList<String> countPathList(String p, int c, int r){
        if(r==1&&c==1){
            ArrayList<String> arrayList=new ArrayList<>();
            arrayList.add(p);
            System.out.println(p);
            return arrayList;
        }
        int left=0;
        int right=0;
        ArrayList<String> bodyArrayList=new ArrayList<>();


        if(r>1){
            bodyArrayList.addAll(countPathList(p+"D",c,r-1));
        }
        if(c>1){
            bodyArrayList.addAll(countPathList(p+"R",c-1,r));
        }
        return bodyArrayList;
    }



    static ArrayList<String> countPathListDiag(String p, int c, int r){
        if(r==1&&c==1){
            ArrayList<String> arrayList=new ArrayList<>();
            arrayList.add(p);
            System.out.println(p);
            return arrayList;
        }
        ArrayList<String> bodyArrayList=new ArrayList<>();


        if(r>1 && c>1){
            bodyArrayList.addAll(countPathListDiag(p+"C",c-1,r-1));
        }
        if(r>1){
            bodyArrayList.addAll(countPathListDiag(p+"D",c,r-1));
        }
        if(c>1){
            bodyArrayList.addAll(countPathListDiag(p+"R",c-1,r));
        }
        return bodyArrayList;
    }

    static void countPathRiverDiag(String p,boolean maze[][],int c,int r){
        if(maze.length-1==r&&c==maze[0].length-1){
            System.out.println(p);
            return ;
        }
        if(!maze[r][c]){
            return;
        }

        if(r< maze.length-1 && c<maze[0].length-1){
            countPathRiverDiag(p+"C",maze,c+1,r+1);
        }
        if(r< maze.length-1){
            countPathRiverDiag(p+"D",maze,c,r+1);
        }
        if(c<maze[0].length-1){
            countPathRiverDiag(p+"R",maze,c+1,r);
        }
    }



    static int countPathRiverDiagAll(String p,boolean maze[][],int c,int r){
        if(maze.length-1==r&&c==maze[0].length-1){
            System.out.println(p);
            return 1;
        }
        if(!maze[r][c]){
            return 0;
        }
        maze[r][c]=false;
        int count=0;
        if(r< maze.length-1){
            count=count+ countPathRiverDiagAll(p+"D",maze,c,r+1);
        }
        if(c<maze[0].length-1){
            count=count+ countPathRiverDiagAll(p+"R",maze,c+1,r);
        }
        if(c>0){
            count=count+countPathRiverDiagAll(p+"L",maze,c-1,r);
        }
        if(r>0){
            count=count+countPathRiverDiagAll(p+"U",maze,c,r-1);
        }
        maze[r][c]=true;
        return count;

    }


    static int countPathRiverDiagAllStep(String p,String s,int maze[][],int c,int r,int step){
        if(maze.length-1==r&&c==maze[0].length-1){
            System.out.println(p);
            System.out.println(s);
            return 1;
        }
        if(maze[r][c]!=0){
            return 0;
        }
        maze[r][c]=step;
        int count=0;
        if(r< maze.length-1){
            count=count+ countPathRiverDiagAllStep(p+"D",s+(step+1),maze,c,r+1,step+1);
        }
        if(c<maze[0].length-1){
            count=count+ countPathRiverDiagAllStep(p+"R",s+(step+1),maze,c+1,r,step+1);
        }
        if(c>0){
            count=count+countPathRiverDiagAllStep(p+"L",s+(step+1),maze,c-1,r,step+1);
        }
        if(r>0){
            count=count+countPathRiverDiagAllStep(p+"U",s+(step+1),maze,c,r-1,step+1);
        }
        maze[r][c]=0;
        return count;

    }


}
