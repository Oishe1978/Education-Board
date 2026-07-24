package Student;

public class Notice {
    private String noticeId;
    private String title;
    private String content;
    private String publishedDate;


    public Notice(String noticeId, String title, String content, String publishedDate) {
        this.noticeId = noticeId;
        this.title = title;
        this.content = content;
        this.publishedDate = publishedDate;
    }


    public String getNoticeId() {
        return noticeId; }
    public void setNoticeId(String noticeId) {
        this.noticeId = noticeId; }

    public String getTitle() {
        return title; }
    public void setTitle(String title) {
        this.title = title; }

    public String getContent() {
        return content; }
    public void setContent(String content) {
        this.content = content; }

    public String getPublishedDate() {
        return publishedDate; }
    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate; }


    @Override
    public String toString() {

        return this.title;
    }
}