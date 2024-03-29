package example.com.exoplayerapp.model;

public class VideoInfo {
    private int mId;
    private String mTitle;
    private String mUrl;
    private String mCoverUrl;
    private String mUserHandle;

    public String getUserHandle() {
        return mUserHandle;
    }

    public void setUserHandle(String mUserHandle) {
        this.mUserHandle = mUserHandle;
    }

    public int getId() {
        return mId;
    }

    public void setId(int mId) {
        this.mId = mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public String getCoverUrl() {
        return mCoverUrl;
    }

    public void setCoverUrl(String mCoverUrl) {
        this.mCoverUrl = mCoverUrl;
    }
}
