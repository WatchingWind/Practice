package newCode.matrix;

import java.util.ArrayList;

public class printMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {

        ArrayList<Integer> lists = new ArrayList<>(matrix.length * matrix[0].length);
        if(matrix.length == 1){
            for(int i = 0;i < matrix[0].length;i++){
                lists.add(matrix[0][i]);
            }

            return lists;
        }

        int ll = 0;
        int lr = 0;
        int rr = matrix.length;
        int rl = matrix[0].length;

        while(ll < rl && lr < rr){

            //ll,lr,rl,lr
            addSameRowElements(matrix,lists,ll,rl,lr);
            //rl,lr,rl,rr
            addSameLineElements(matrix,lists,lr,rr,rl);
            //rl,rr,ll,rr
            addSameRowElements(matrix,lists,rl,ll,rr);
            //ll,rr,ll,lr
            addSameLineElements(matrix,lists,rr,lr,ll);

            ll++;
            lr++;
            rl--;
            rr--;
        }

        return lists;
    }

    private void addElements(int [][] matrix, ArrayList<Integer> lists, int ll,int lr,int rl,int rr ){
        boolean flag = true;
        while(flag){
            if(ll < rl){
                lists.add(matrix[lr][ll++]);
            }else()
        }
        while()

    }




    private void addSameLineElements(int [][] matrix, ArrayList<Integer> lists, int lr,int rr,int l ){
       if(lr < rr){
         for(int i = lr + 1;lr < rr;i++){

         }
       }

       if(lr > rr){
           for(int i = rr - 2;)
       }
    }
    private void addSameRowElements(int [][] matrix, ArrayList<Integer> lists,int ll,int rl, int r){
        if(ll < rl){
            for(int i = ll;i < rl;i++){
                lists.add(matrix[r][i]);
            }
        }

        if(ll > rl){
            for(int i = ll - 1;i >= rl;i--){
                lists.add(matrix[r][i]);
            }
        }
    }




}
