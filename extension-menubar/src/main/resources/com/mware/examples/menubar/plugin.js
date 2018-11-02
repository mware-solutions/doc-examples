require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('org.bigconnect.menubar', {
        title: i18n('com.mware.examples.menubar.title'),
        identifier: 'com.mware-examples-menubar',
        action: {
            type: 'pane',
            componentPath: 'com/mware/examples/menubar/Pane'
        },
        welcomeTemplatePath: 'hbs!com/mware/examples/menubar/welcome',
        icon: '../img/glyphicons/white/glyphicons_066_tags@2x.png',
        options: {
            placementHint: 'top',
            placementHintAfter: 'search',
        }
    });

});
