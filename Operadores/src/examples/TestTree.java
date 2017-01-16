package examples;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

class TestTree {

	public String toString(){
		return "Test3";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<TestTree> s = new TreeSet<TestTree>();
		s.add(new TestTree());
		s.add(new TestTree());
		s.add(new TestTree());
		for (TestTree testTree : s) {
			System.out.println(testTree);
		}
	
	}

}
