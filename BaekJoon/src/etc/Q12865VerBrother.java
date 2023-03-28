package etc;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Q12865VerBrother {

	static class Pair {
		int depth;
		int value;
		public Pair(int depth, int value) {
			super();
			this.depth = depth;
			this.value = value;
		}
		public int getDepth() {
			return depth;
		}
		public void setDepth(int depth) {
			this.depth = depth;
		}
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		@Override
		public String toString() {
			return "Pair [depth=" + depth + ", value=" + value + "]";
		}
		
	}
	
	static List<Pair> list = new ArrayList<>();
	
	static void init () {
		System.out.println("dd");
		list.add(new Pair(6, 13));
		list.add(new Pair(4,  8));
		list.add(new Pair(3,  6));
		list.add(new Pair(5, 12));
		list.add(new Pair(2, 20));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
		Pair maxPair = new Pair(0, 0);
		for (int i = 0, len = list.size(); i < len; i++) {
			maxPair = getMax(getPair(list, i, 13), maxPair);
		}
		System.out.println(maxPair);
	}
	
	static Pair getMax(Pair a, Pair b) {
		return a.getValue() > b.getValue() ? a : b;
	}
	
	static Pair getPair(List<Pair> list, int idx, int depth) {
		if (idx == list.size()) return new Pair(0, 0);
		
		
		Pair curPair = list.get(idx);
		
		if (depth >= curPair.depth) {
			Pair anotherPair = new Pair(0, 0);
			List<Pair> tmpArr = list.stream().filter(e -> Objects.deepEquals(curPair, e)).collect(Collectors.toList());
			
			for (int i = 0, len = tmpArr.size(); i < len; i++) {
				anotherPair = getMax(
						getPair(tmpArr, i, depth - curPair.depth), 
						anotherPair
				);
			}
			
			return new Pair(
					curPair.depth + anotherPair.depth, curPair.value + anotherPair.value
			);		
		} else {
			return getPair(list, idx+1, depth);
		}	
	}

}
