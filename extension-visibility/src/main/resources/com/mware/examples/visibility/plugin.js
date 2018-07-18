require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('com.mware.visibility', {
        editorComponentPath: 'com.mware/examples/visibility/ExampleEditor',
        viewerComponentPath: 'com.mware/examples/visibility/ExampleViewer'
    });
});
