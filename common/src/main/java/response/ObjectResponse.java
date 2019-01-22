package response;

/**
 * @author fumiao
 */
public class ObjectResponse<T> extends BaseResponse {
	
    T data;
    
    public ObjectResponse() {
	}
    
    public ObjectResponse(int status, String message,boolean rel) {
        super(status,message,rel);
    }
    
    public ObjectResponse(T data) {
		this.data = data;
	}
    
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	public  ObjectResponse<T> ok(){
		return this;
	}
	
	public  ObjectResponse<T> error(int status, String message){
		this.setStatus(status);
		this.setMessage(message);
		this.setRel(false);
		return this;
	}
	
}
