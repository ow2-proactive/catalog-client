package org.ow2.proactive.service;

import static com.google.common.truth.Truth.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.google.common.io.Files;

@RunWith(MockitoJUnitRunner.class)
public class GetFromURLServiceTest {

    @Mock
    private RemoteObjectService remoteObjectService;

    @Mock
    private CatalogObjectService catalogObjectService;

    @Mock
    private ServiceConfiguration serviceConfiguration;

    @InjectMocks
    private GetFromURLService getFromURLService;

    private static final String CATALOG_URL = "http://localhost:8080/catalog";
    private static final String REMOTE_URL = "localhost:8080/test/example.txt";
    private static final String REMOTE_URL2 = "localhost:8080/test/example2.txt";
    private static final String REMOTE_VALUE = "remoteValue";
    private static final String REMOTE_VALUE2 = "remoteValue2";


    @Test
    public void getResourceWithOneReplacementTest() throws IOException {
        when(catalogObjectService.getRawCatalogObject(CATALOG_URL, 1, "myResourceTest"))
                .thenReturn(getWorkflowString("workflows/workflowWithPAGetFromURL.xml"));
        when(remoteObjectService.sendRequest(REMOTE_URL, String.class))
                .thenReturn(REMOTE_VALUE);
        when(serviceConfiguration.getCatalogURL()).thenReturn(CATALOG_URL);

        String replacedWorkflow = getFromURLService.getResource(1, "myResourceTest", true);
        assertThat(replacedWorkflow).isEqualTo(getWorkflowString("workflows/workflowWithPAGetFromURLReplaced.xml"));

        verify(catalogObjectService,times(1)).getRawCatalogObject(CATALOG_URL,1,"myResourceTest");
        verify(remoteObjectService,times(1)).sendRequest(REMOTE_URL,String.class);
    }

    @Test
    public void getResourceWithSeveralReplacementTest() throws IOException {
        when(catalogObjectService.getRawCatalogObject(CATALOG_URL, 1, "myResourceTest2"))
                .thenReturn(getWorkflowString("workflows/workflowWithSeveralPAGetFromURL.xml"));
        when(remoteObjectService.sendRequest(REMOTE_URL, String.class))
                .thenReturn(REMOTE_VALUE);
        when(remoteObjectService.sendRequest(REMOTE_URL2, String.class))
                .thenReturn(REMOTE_VALUE2);
        when(serviceConfiguration.getCatalogURL()).thenReturn(CATALOG_URL);

        String replacedWorkflow = getFromURLService.getResource(1, "myResourceTest2", true);
        assertThat(replacedWorkflow).isEqualTo(getWorkflowString("workflows/workflowWithSeveralPAGetFromURLReplaced.xml"));

        verify(catalogObjectService,times(1)).getRawCatalogObject(CATALOG_URL,1,"myResourceTest2");
        verify(remoteObjectService,times(2)).sendRequest(REMOTE_URL,String.class);
        verify(remoteObjectService,times(1)).sendRequest(REMOTE_URL2,String.class);
    }




    private String getWorkflowString(String path) throws IOException {
        URL relativeUrl = GetFromURLService.class.getClassLoader().getResource(path);
        File workflowFile = new File(relativeUrl.getPath());
        return Files.toString(workflowFile, Charset.forName("UTF-8"));
    }
}
