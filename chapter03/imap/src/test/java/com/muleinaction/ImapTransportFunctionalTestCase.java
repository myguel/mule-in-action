package com.muleinaction;

import org.mule.api.service.Service;
import org.mule.tck.FunctionalTestCase;

/**
 * @author John D'Emic (john.demic@gmail.com)
 */
public class ImapTransportFunctionalTestCase extends AbstractEmailFunctionalTestCase {

    public ImapTransportFunctionalTestCase()
    {
        super(65433, STRING_MESSAGE, "imap");
    }

	@Override
	protected String getConfigResources() {
		return "conf/imap-config.xml";
	}

	public void testCorrectlyInitialized() throws Exception {
		final Service service = muleContext.getRegistry().lookupService(
				"imapService");

		assertNotNull(service);
		assertEquals("imapModel", service.getModel().getName());
	}

}
