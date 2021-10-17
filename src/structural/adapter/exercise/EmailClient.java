package structural.adapter.exercise;

import java.util.LinkedList;
import java.util.List;

public class EmailClient {
    private List<EmailProvider> providers = new LinkedList<>();

    public void addProvider(EmailProvider provider) {
        providers.add(provider);
    }

    public void downloadEmails() {
        for (var provider : providers)
            provider.downloadEmails();
    }
}
