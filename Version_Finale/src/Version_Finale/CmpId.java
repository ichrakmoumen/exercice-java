package Version_Finale;

import java.util.Comparator;

public class CmpId implements Comparator<Employe>{

	@Override
	public int compare(Employe o1, Employe o2) {
		// TODO Auto-generated method stub
		return o1.getId().compareTo(o2.getId());
	}

}
