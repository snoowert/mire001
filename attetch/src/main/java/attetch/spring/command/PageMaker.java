package attetch.spring.command;

public class PageMaker {
	private int page = 1;
	private int perPageNum = 10;
	private String SearchType = "";
	private String keyword = "";

	private int totalCount;
	private int startPage;
	private int endPage;
	private int realEndPage;
	private boolean prev;
	private boolean next;

	private int displayPageNum = 10;

	public int getPerPageNum() {
		return perPageNum;
	}

	public void setPerPageNum(int perPageNum) {
		this.perPageNum = perPageNum;
	}

	public String getSearchType() {
		return SearchType;
	}

	public void setSearchType(String searchType) {
		SearchType = searchType;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getDisplayPageNum() {
		return displayPageNum;
	}

	public void setDisplayPageNum(int displayPageNum) {
		this.displayPageNum = displayPageNum;
	}

	public int getPage() {
		return page;
	}

	public int getStartPage() {
		return startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public int getRealEndPage() {
		return realEndPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public boolean isNext() {
		return next;
	}

	public void calcData() {
		endPage = (int) (Math.ceil(page / (double) displayPageNum) * displayPageNum);
		startPage = endPage - displayPageNum + 1;

		realEndPage = (int) (Math.ceil(totalCount / (double) perPageNum));

		startPage = (startPage < 1) ? 1 : startPage;
		endPage = (endPage > realEndPage) ? realEndPage : endPage;

		prev = (startPage == 1) ? false : true;
		next = (endPage < realEndPage) ? true : false;
	}
}
