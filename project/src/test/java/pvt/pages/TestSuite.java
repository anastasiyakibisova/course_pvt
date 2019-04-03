package pvt.pages;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@Suite.SuiteClasses({
	MoveToSpamTest.class,
	ExtractFromSpam.class,
	SendingMessageToUserGroupTest.class,
	FlagThreeLetters.class,
	UncheckAllMailboxes.class,
	PostingVk.class,
	EditingVk.class,
	DeletingVk.class,
	MailNegativeTest.class,
	VkNegativeTest.class
})
@RunWith(Suite.class)
public class TestSuite {

}
