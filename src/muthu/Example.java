package muthu;

public class Example {
	public static void printBalancedUniqueSets(char[] c, int k,int i, int o, int cl) {
		  
		  if(i==c.length){
			System.out.println(c);
		
		  }
		  if(o<k){
		    c[i]='{';
		    printBalancedUniqueSets(c,k,i+1,o+1,cl);
		}
		    if(cl<o){
		    c[i]='}';
		    printBalancedUniqueSets(c,k,i+1,o,cl+1);
		    }
		}
	public static void main(String[] args) {
		char[] c = new char[6];
		printBalancedUniqueSets(c, 3, 0, 0, 0);
	}
}
