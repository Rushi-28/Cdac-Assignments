package intrefaceAssi4;

public class IdCompare implements ObjCompare {

	@Override
	public int Compare(Object a, Object b) {
		// TODO Auto-generated method stub
		Student s1=null,s2=null;
		if(a instanceof Student)
			s1=(Student)a;
		if(b instanceof Student)	
			s2=(Student)b;
		return s1.getSid()-s2.getSid();
	}

}
