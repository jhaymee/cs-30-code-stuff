// Program name: Loop Stats

// Student name: Jhaymee Bisenio

// Date: 27 May 2024

// Program Description:

import static java.lang.System.*;

public class LoopStats
{
	private int start, stop;

	public LoopStats() {

	}

	public LoopStats(int beg, int end) {
		beg = start;
		end = stop;
		System.out.println(allEvens());
		System.out.println(allOdds());
	}

	public void setNums(int beg, int end) {


	}

	public int allEvens() {
		int evenCount=0;
		int i = 0;
		for (i = start; i <= stop; i++) {
			if (i % 2 == 0) {
				evenCount++;
			}
		}

		return evenCount;
	}

	public int allOdds() {
		int oddCount=0;
		int i = 0;
		for (i = start; i <= stop; i++) {
			if (i % 2 != 0) {
				oddCount++;
			}
		}

		return oddCount;
	}

	public int getTotal() {
		int total=0;




		return total;
	}
	
	public String toString() {
		return start + " " + stop;
	}
}