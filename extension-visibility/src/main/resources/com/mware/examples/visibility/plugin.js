require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('org.bigconnect.visibility', {
        editorComponentPath: 'com/mware/examples/visibility/ExampleEditor',
        viewerComponentPath: 'com/mware/examples/visibility/ExampleViewer'
    });
});
