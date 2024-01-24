package intrefaceAssi4;

public class MarksCompare implements ObjCompare {

	@Override
	public int Compare(Object a, Object b) {
		// TODO Auto-generated method stub
		Student s1=null,s2=null;
		if(a instanceof Student)
			s1=(Student)a;
		if(b instanceof Student)
			s2=(Student)b;
		if(s1.getMarks()>s2.getMarks())
			return 1;
		else if(s1.getMarks()<s2.getMarks())
			return -1;
		else
			return 0;
			
	}

}
