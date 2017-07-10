import android.support.annotation.NonNull;

/**
 * Created by laurent on 7/10/17.
 */

public class SimpleViewModel {
    private String simpleText;

    public SimpleViewModel(@NonNull final String simpleText) {
        setSimpleText(simpleText);
    }

    @NonNull
    public String getSimpleText() {
        return simpleText;
    }

    public void setSimpleText(@NonNull final String simpleText) {
        this.simpleText = simpleText;
    }
}
