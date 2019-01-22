package response;

import java.util.List;

/**
 *
 * @author fumiao
 */
public class ListResponse<T> extends BaseResponse{
	
    List<T> data;
    
    public ListResponse() {
    	
	}
    
    public ListResponse(int status, String message,boolean rel) {
        super(status,message,rel);
    }
    
    public ListResponse(List<T> data) {
		this.data = data;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
	
	public  ListResponse<T> ok(){
		return this;
	}
	
	public  ListResponse<T> error(int status, String message){
		this.setStatus(status);
		this.setMessage(message);
		this.setRel(false);
		return this;
	}
	
}
