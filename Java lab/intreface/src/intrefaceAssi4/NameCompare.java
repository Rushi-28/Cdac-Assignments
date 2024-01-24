package intrefaceAssi4;

public class NameCompare implements ObjCompare {

	@Override
	public int Compare(Object a, Object b) {
		
		Student s1=null,s2=null;
		if(a instanceof Student)
			s1=(Student)a;
		if(b instanceof Student)	
			s2=(Student)b;
		return s1.getName().compareTo(s2.getName());
	}

}