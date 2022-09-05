<template>

    <v-card outlined>
        <v-card-title>
            회의실정보 # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: '회의실정보ViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/회의실정보/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

