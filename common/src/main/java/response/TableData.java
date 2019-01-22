package response;

import java.io.Serializable;
import java.util.List;

public class TableData<T> implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	long total;
	List<T> rows;
	
	public TableData() {
			super();
    }
    
    public TableData(long total, List<T> rows) {
		this.total=total;
		this.rows=rows;
	}
    
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}

}
