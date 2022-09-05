<template>

    <v-data-table
        :headers="headers"
        :items="회의실리스트"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: '회의실리스트View',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            회의실리스트 : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/회의실리스트'))

            temp.data._embedded.회의실리스트.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.회의실리스트 = temp.data._embedded.회의실리스트;
        },
        methods: {
        }
    }
</script>

