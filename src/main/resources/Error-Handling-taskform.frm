{"id":"ec9d48b3-e7f9-475b-b1dc-5ecd64e4d45b","name":"Error-Handling-taskform.frm","model":{"taskName":"Error-Handling","processId":"error-handling","name":"task","properties":[{"name":"result","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[]}},{"name":"strategy","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[]}},{"name":"Url","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[]}}],"formModelType":"org.kie.workbench.common.forms.jbpm.model.authoring.task.TaskFormModel"},"fields":[{"maxLength":100,"placeHolder":"Result","id":"field_310236250721832E11","name":"result","label":"Result","required":false,"readOnly":false,"validateOnChange":true,"binding":"result","standaloneClassName":"java.lang.String","code":"TextBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.textBox.definition.TextBoxFieldDefinition"},{"maxLength":100,"placeHolder":"Url","id":"field_444894398832056E11","name":"Url","label":"Url","required":false,"readOnly":false,"validateOnChange":true,"binding":"Url","standaloneClassName":"java.lang.String","code":"TextBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.textBox.definition.TextBoxFieldDefinition"},{"options":[{"value":"COMPLETE","text":"COMPLETE"},{"value":"RETRY","text":"RETRY"},{"value":"RETHROW","text":"RETHROW"}],"addEmptyOption":true,"dataProvider":"","id":"field_4342815098380796E12","name":"strategy","label":"Strategy","required":false,"readOnly":false,"validateOnChange":true,"helpMessage":"","binding":"strategy","standaloneClassName":"java.lang.String","code":"ListBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.selectors.listBox.definition.StringListBoxFieldDefinition"}],"layoutTemplate":{"version":3,"style":"FLUID","layoutProperties":{},"rows":[{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_444894398832056E11","form_id":"ec9d48b3-e7f9-475b-b1dc-5ecd64e4d45b"},"parts":[]}]}]},{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_4342815098380796E12","form_id":"ec9d48b3-e7f9-475b-b1dc-5ecd64e4d45b"},"parts":[{"partId":"Field Label","cssProperties":{}},{"partId":"ListBox","cssProperties":{}}]}]}]},{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_310236250721832E11","form_id":"ec9d48b3-e7f9-475b-b1dc-5ecd64e4d45b"},"parts":[]}]}]}]}}