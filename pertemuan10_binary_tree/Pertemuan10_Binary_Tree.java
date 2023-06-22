package pertemuan10_binary_tree;

public class Pertemuan10_Binary_Tree {
    // Mewakili simpul pohon biner     
    public static class Node{    
        int data;    
        Node left;    
        Node right;    
        public Node(int data){
            
            //Tetapkan data ke simpul baru, setel anak kiri dan kanan ke nol      
            this.data = data;    
            this.left = null;    
            this.right = null;    
            }    
        } 
    
    // Mewakili akar dari pohon biner    
    public Node root;    
    public Pertemuan10_Binary_Tree(){    
        root = null;    
    }  
    
    //faktorial() akan menghitung faktorial dari angka yang diberikan   
    public int factorial(int num) {    
        int fact = 1;    
        if(num == 0)    
            return 1;    
        else {    
            while(num > 1) {    
                fact = fact * num;    
                num--;    
            }    
            return fact;    
        }    
    }    
    //numOfBST() akan menghitung jumlah total kemungkinan BST dengan menghitung Nomor Katalan untuk kunci yang diberikan     
    public int numOfBST(int key) {    
        int catalanNumber = factorial(2 * key)/(factorial(key + 1) * factorial(key));    
        return catalanNumber;    
    } 
    
    public static void main(String[] args) {
       Pertemuan10_Binary_Tree bt = new Pertemuan10_Binary_Tree();    
        //Tampilkan jumlah total kemungkinan pohon pencarian biner dengan kunci 5  
        
        System.out.println("Total number of possible Binary Search Trees with given key: " + bt.numOfBST(4));   
        
    }
    
}
       
        //10
        //20
        //30
        //40
        //50
        //60
        //70
        //80
        //90
        //100
        //110
        //120
        //150