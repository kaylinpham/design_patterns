package structural.adapter.exercise;

import structural.adapter.exercise.gmail.GmailClient;

public class GmailProvider implements EmailProvider {
    private GmailClient client;

    public GmailProvider(GmailClient client) {
        this.client = client;
    }

    @Override
    public void downloadEmails() {
        client.connect();
        client.getEmails();
        client.disconnect();
    }
}
