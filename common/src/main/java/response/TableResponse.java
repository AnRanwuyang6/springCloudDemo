package response;

import java.util.List;

/**
 * @author fumiao
 */
public class TableResponse<T> extends BaseResponse {

    TableData<T> data;
    
    public  TableResponse() {
    	
	}

    public TableResponse(long total, List<T> rows) {
        this.data = new TableData<T>(total, rows);
    }

    TableResponse<T> total(int total) {
        this.data.setTotal(total);
        return this;
    }

    TableResponse<T> total(List<T> rows) {
        this.data.setRows(rows);
        return this;
    }

    public TableData<T> getData() {
        return data;
    }

    public void setData(TableData<T> data) {
        this.data = data;
    }
    
    public  TableResponse<T> ok(){
		return this;
	}
	
	public  TableResponse<T> error(int status, String message){
		this.setStatus(status);
		this.setMessage(message);
		this.setRel(false);
		return this;
	}

}
