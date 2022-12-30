
package Data_Structure;


public class Tree_Inorder {
    int data;
    Tree_Inorder  left,right;
    
    Tree_Inorder(int item)
    {
        data=item;
        left=right=null;
    }    
}
 class Binary_tree{
     Tree_Inorder root;
     
     void push(Tree_Inorder root){
         Tree_Inorder current,per;
     
         if(root == null)
          return ;
               current=root;
           
     }

}
class result extends Binary_tree{
    public static void main(String[] args) {
        Binary_tree tree=new Binary_tree();
        tree.root=new  Tree_Inorder(1);
        
    }
}
