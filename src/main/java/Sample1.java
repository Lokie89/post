/**
 * Javadoc 테스트용 클래스
 *
 * @author amoeba
 * @version 1.0
 */
public class Sample1 {

    /**
     * 폭
     */
    private int w;

    /**
     * 높이
     */
    private int h;

    /**
     * 디폴트 생성자 클래스
     */
    public Sample1() {
        w = 0;
        h = 0;
    }

    /**
     * 사이즈 설정
     *
     * @param width 폭
     * @param height 높이
     */
    public void setSize(int width, int height) {
        w = width;
        h = height;
    }

    /**
     * 폭 반환
     *
     * @return 폭
     */
    public int getWidth() {
        return w;
    }

    /**
     * 높이 반환
     *
     * @return 높이
     */
    public int getHeight() {
        return h;
    }
}