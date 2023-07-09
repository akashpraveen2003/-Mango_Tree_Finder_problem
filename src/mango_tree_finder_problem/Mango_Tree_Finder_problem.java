package mango_tree_finder_problem;

import java.util.Scanner;

public class Mango_Tree_Finder_problem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int row=scanner.nextInt();
		int column=scanner.nextInt();
		int tree_number=scanner.nextInt();
		boolean mango_tree_or_not=false;
		if(tree_number>=0 && tree_number<=column)
		{
			mango_tree_or_not=true;
		}
		if(tree_number%column==0 || tree_number%column==1)
		{
			mango_tree_or_not=true;
		}
		System.out.println(mango_tree_or_not);
	}

}
