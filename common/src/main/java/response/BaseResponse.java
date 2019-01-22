package response;

/**
 * @author fumiao
 */
public class BaseResponse {
    private int status = 200;
    private String message="成功";
    private boolean rel=true;



    public BaseResponse() {
    }
    
    public BaseResponse(int status, String message,boolean rel) {
        this.status = status;
        this.message = message;
        this.rel=rel;
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public boolean isRel() {
		return rel;
	}

	public void setRel(boolean rel) {
		this.rel = rel;
	}
	
	public  BaseResponse ok(){
		return this;
	}
	
	public  BaseResponse error(int status, String message){
		this.setStatus(status);
		this.setMessage(message);
		this.setRel(false);
		return this;
	}

}
