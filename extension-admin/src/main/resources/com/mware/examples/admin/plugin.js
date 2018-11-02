require(['public/v1/api'], function(bc) {

    bc.registry.registerExtension('org.bigconnect.admin', {
       section: i18n('com.mware.examples.admin.section'),
       name: i18n('com.mware.examples.admin.react.name'),
       subtitle: i18n('com.mware.examples.admin.react.subtitle'),
       componentPath: 'com/mware/examples/admin/React'
    });

    bc.registry.registerExtension('org.bigconnect.admin', {
       section: i18n('com.mware.examples.admin.section'),
       name: i18n('com.mware.examples.admin.flight.name'),
       subtitle: i18n('com.mware.examples.admin.flight.subtitle'),
       componentPath: 'com/mware/examples/admin/flight'
    });

    bc.registry.registerExtension('org.bigconnect.admin', {
       section: i18n('com.mware.examples.admin.section'),
       name: i18n('com.mware.examples.admin.url.name'),
       subtitle: i18n('com.mware.examples.admin.url.subtitle'),
       url: 'https://www.bigconnect.io',
       options: {
           sortHint: 0
       }
    });

});
