package ohos.sysappcomponents.contact;

import java.util.List;
import ohos.app.Context;
import ohos.sysappcomponents.contact.entity.Contact;
import ohos.sysappcomponents.contact.entity.Group;
import ohos.sysappcomponents.contact.entity.Holder;

/* loaded from: ohos2.0.1.95.jar:ohos/sysappcomponents/contact/ContactsHelper.class */
public class ContactsHelper {
    public ContactsHelper(Context context) {
        throw new RuntimeException("Stub!");
    }

    public ContactsCollection queryContactsByPhoneNumber(String phoneNumber, Holder holder, ContactAttributes attrs) {
        throw new RuntimeException("Stub!");
    }

    public ContactsCollection queryContactsByEmail(String email, Holder holder, ContactAttributes attrs) {
        throw new RuntimeException("Stub!");
    }

    public HoldersCollection queryHolders() {
        throw new RuntimeException("Stub!");
    }

    public ContactsCollection queryContacts(Holder holder, ContactAttributes attrs) {
        throw new RuntimeException("Stub!");
    }

    public Contact queryMyCard(ContactAttributes attrs) {
        throw new RuntimeException("Stub!");
    }

    public Contact queryContact(String key, Holder holder, ContactAttributes attrs) {
        throw new RuntimeException("Stub!");
    }

    public long addContact(Contact contact) {
        throw new RuntimeException("Stub!");
    }

    public boolean deleteContact(String key) {
        throw new RuntimeException("Stub!");
    }

    public boolean updateContact(Contact contact, ContactAttributes attrs) {
        throw new RuntimeException("Stub!");
    }

    public boolean isMyCard(long id) {
        throw new RuntimeException("Stub!");
    }

    public List<Group> queryGroups(Holder holder) {
        throw new RuntimeException("Stub!");
    }

    public String queryKey(long id, Holder holder) {
        throw new RuntimeException("Stub!");
    }

    public boolean isLocalContact(long id) {
        throw new RuntimeException("Stub!");
    }
}
