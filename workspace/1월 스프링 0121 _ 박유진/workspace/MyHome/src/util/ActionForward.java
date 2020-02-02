package util;

public class ActionForward {
	
	private String nextPath; //다음으로 넘길 페이지 경로
	private boolean isRedirect; //페이지를 어떻게 저장시킬지? 
	
	public ActionForward(String nextPath, boolean isRedirect) {
		this.nextPath = nextPath;
		this.isRedirect = isRedirect;
		
	}

	public String getNextPath() {
		return nextPath;
	}

	public void setNextPath(String nextPath) {
		this.nextPath = nextPath;
	}

	public boolean isRedirect() {
		return isRedirect;
	}

	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}

	
	
}
