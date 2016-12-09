package lib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IRanderableHolder {
	private static final IRanderableHolder instance = new IRanderableHolder();

	private List<IRanderable> entities;
	private Comparator<IRanderable> comparator;
	
	public IRanderableHolder() {
		entities = new ArrayList<IRanderable>();
		comparator = (IRanderable o1, IRanderable o2) -> {
			if (o1.getZ() > o2.getZ())
				return 1;
			return -1;
		};
	}
	
	public static IRanderableHolder getInstance() {
		return instance;
	}
	
	public void addAndSort(IRanderable entity) {
		add(entity);
		sort();
	}
	
	public void add(IRanderable entity) {
		entities.add(entity);
		sort();
	}
	
	public void sort(){
		Collections.sort(entities, comparator);
	}
	
	
	public List<IRanderable> getEntities() {
		return entities;
	}
}