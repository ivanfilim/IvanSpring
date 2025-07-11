package quoters;

import javax.annotation.Nonnull;

public class TerminatorQuoter implements Quoter {
    private String message;

    public void setMessage(@Nonnull String message) {
        this.message = message;
    }

    @Override
    public void sayQuote() {
        System.out.println("message = " + message);
    }
}
